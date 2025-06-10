package sprint_1.task_02

data class User(val name: String,
                val age: Int,
                val job: String,
                val address: String) {
    val VALID_JOBS = setOf("Google", "Uber", "Amazon")
    val VALID_ADDRESS = setOf("London", "New York", "Amsterdam")

    init {
        require(age > 18) {
            "User must be older than 18"
        }
        require(name.isNotEmpty()) {
            "User must have a name"
        }
        require(VALID_ADDRESS.contains(address)) {
            "User must have a valid address"
        }
        require(VALID_JOBS.contains(job)) {
            "User must have a valid job"
        }
    }
}
