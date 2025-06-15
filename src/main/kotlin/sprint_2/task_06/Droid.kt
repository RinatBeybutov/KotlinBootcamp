package org.example.sprint_2.task_06

class Droid(var name: String) {
    private val ALPHABET_LENGTH = 26
    private val ENCRYPTOR: DroidMessageEncryptor = DroidMessageEncryptor { msg, key ->
        require(key in -25 .. 25)
        val builder = StringBuilder()
        for (ch in msg) {
            if (ch.isLetter()) {
                val base = if (ch.isLowerCase()) 'a' else 'A'
                val offset = (ch - base + key).mod(ALPHABET_LENGTH)
                builder.append(base + offset)
            } else {
                builder.append(ch)
            }
        }
        builder.toString()
    }

    private fun encrypt(msg: String, key: Int): String {
        return ENCRYPTOR.encrypt(msg, key)
    }

    private fun decrypt(msg: String, key: Int): String {
        return ENCRYPTOR.encrypt(msg, ALPHABET_LENGTH - key)
    }

    fun sendMessage(message: String, recipient: Droid, key: Int) {
        val encryptedMessage = encrypt(message, key)
        println("$name отправил зашифрованное сообщение $encryptedMessage")
        recipient.receiveMessage(encryptedMessage, key)
    }

    fun receiveMessage(encryptedMessage: String, key: Int) {
        val decryptedMessage = decrypt(encryptedMessage, key)
        println("$name получил зашифрованное сообщение $decryptedMessage")
    }
}