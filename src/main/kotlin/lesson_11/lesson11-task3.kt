package lesson_11

class Room(
    val cover: String,
    val name: String,
    private val listOfMembers: MutableList<MemberAvatar> = mutableListOf()
) {
    fun addMember(member: MemberAvatar) = listOfMembers.add(member)

    fun updateMemberStatus(memberNickname: String, memberStatus: String) {
        listOfMembers.forEach {
            if (it.nickname == memberNickname) it.status = memberStatus
            else println("Такого пользователя нет в комнате")
        }
    }

    fun getMemberStatusByLongPressingAvatar(member: MemberAvatar) {
        println(
            "Пользователь ${member.nickname} в комнате \"$name\", " +
                    "его статус: ${listOfMembers.joinToString { it.status }}"
        )
    }
}

data class MemberAvatar(
    val nickname: String,
    var status: String,
)

fun main() {
    val room1 = Room(
        cover = "src/img/summer_cafe",
        name = "С другом в летней кафешке",
    )
    val member1 = MemberAvatar(
        nickname = "Pashok",
        status = "разговаривает"
    )

    room1.addMember(member1)

    room1.getMemberStatusByLongPressingAvatar(member1)

    room1.updateMemberStatus("Pashok", "микрофон выключен")

    room1.getMemberStatusByLongPressingAvatar(member1)
}