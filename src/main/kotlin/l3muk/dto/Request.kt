package l3muk.dto

data class NoteCreateRequest(
  val protocol: Int,
  val docType: String,
  val docName: String,
  val recipient: String,
  val author: String
)

