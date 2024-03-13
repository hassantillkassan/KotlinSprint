package lesson_15

const val MAX_NUM_OF_PAX_FOR_LORRY = 1
const val MAX_NUM_OF_PAX_FOR_CAR = 3
const val MAX_WEIGHT_CARRIED_LORRY = 2

abstract class Vehicle {

    abstract val maxNumOfPassengers: Int
    abstract val loadWeight: Int

}

class Lorry : Vehicle(), Movement, PassengerCarriage, CargoTransportation {

    override val maxNumOfPassengers = MAX_NUM_OF_PAX_FOR_LORRY
    override val loadWeight = MAX_WEIGHT_CARRIED_LORRY
    var arrivingPassengers = 0
    var arrivingCargo = 0
    override fun drive() {
        println("Грузовик поехал")
    }

    override fun passengerLoad(numberOfPassengers: Int): Int {
        if (numberOfPassengers > maxNumOfPassengers) {
            println(
                "Загружено $maxNumOfPassengers пассажиров\n" +
                        "Осталось ${numberOfPassengers - maxNumOfPassengers} пассажиров"
            )
            arrivingPassengers += maxNumOfPassengers
            return numberOfPassengers - maxNumOfPassengers
        } else {
            println("Загружены все $numberOfPassengers пассажиров")
            arrivingPassengers += numberOfPassengers
            return 0
        }
    }

    override fun offloadPassengers(): Int {
        println("Загруженные пассажиры прибыли на грузовике")
        return arrivingPassengers
    }

    override fun loadCargo(cargoWeight: Int): Int {
        if (cargoWeight > loadWeight) {
            println(
                "Загружен $loadWeight тонн груза\n" +
                        "Осталось ${cargoWeight - loadWeight} тонн груза"
            )
            arrivingCargo += cargoWeight - loadWeight
            return cargoWeight - loadWeight
        } else {
            println("Загружен весь груз, весом $cargoWeight тонн")
            arrivingCargo += cargoWeight
            return 0
        }
    }

    override fun unloadCargo(): Int {
        println("Погруженный груз прибыл на грузовике")
        return arrivingCargo
    }

}

class Car : Vehicle(), Movement, PassengerCarriage {

    override val maxNumOfPassengers = MAX_NUM_OF_PAX_FOR_CAR
    override val loadWeight = 0
    var arrivingPassengers = 0
    override fun drive() {
        println("Автомобиль поехал")
    }

    override fun passengerLoad(numberOfPassengers: Int): Int {
        if (numberOfPassengers > maxNumOfPassengers) {
            println(
                "Загружено $maxNumOfPassengers пассажиров\n" +
                        "Осталось ${numberOfPassengers - maxNumOfPassengers} пассажиров"
            )
            arrivingPassengers += maxNumOfPassengers
            return numberOfPassengers - maxNumOfPassengers
        } else {
            println("Загружены все $numberOfPassengers пассажиров")
            arrivingPassengers += numberOfPassengers
            return 0
        }
    }

    override fun offloadPassengers(): Int {
        println("Загруженные пассажиры прибыли на автомобиле")
        return arrivingPassengers
    }

}

interface Movement {

    fun drive()

}

interface PassengerCarriage {

    fun passengerLoad(numberOfPassengers: Int): Int
    fun offloadPassengers(): Int

}

interface CargoTransportation {

    fun loadCargo(cargoWeight: Int): Int
    fun unloadCargo(): Int
}

fun main() {

    var needToTransportPassengers = 6
    var needToMoveCargo = 2
    var arrivedPassengersOnCargo = 0
    var arrivedPassengersOnCar = 0
    var arrivedCargo = 0

    val car1 = Car()
    val lorry1 = Lorry()

    needToTransportPassengers = lorry1.passengerLoad(needToTransportPassengers)
    needToMoveCargo = lorry1.loadCargo(needToMoveCargo)
    lorry1.drive()
    arrivedPassengersOnCargo = lorry1.offloadPassengers()
    arrivedCargo = lorry1.unloadCargo()


    needToTransportPassengers = car1.passengerLoad(needToTransportPassengers)
    car1.drive()
    arrivedPassengersOnCar = car1.offloadPassengers()


    needToTransportPassengers = car1.passengerLoad(needToTransportPassengers)
    car1.drive()
    arrivedPassengersOnCar = car1.offloadPassengers()

    println(
        "В конечный пункт прибыло ${arrivedPassengersOnCar + arrivedPassengersOnCargo} " +
                "пассажиров и $arrivedCargo тонны груза"
    )


}