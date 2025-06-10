import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import sprint_1.task_09.StudentDatabase
import sprint_1.task_09.Subject
import kotlin.test.assertEquals

class StudentDbTests {

    @Test
    @DisplayName("Проверка добавления студента в базу данных")
    fun addStudent() {
        val db = StudentDatabase()
        val marks = mutableMapOf(Pair(Subject("Math"), 5))
        db.addNewStudent("Alex", marks)

        val students = db.getStudents()
        val alex = students.keys
            .firstOrNull { it.name == "Alex" }
        assertNotNull(alex)
        val actualSubjects = students[alex]
        assertEquals(marks, actualSubjects)
    }

    @Test
    @DisplayName("Проверка добавления предмета")
    fun addSubject() {
        val db = StudentDatabase()
        val marks = mutableMapOf(Pair(Subject("Math"), 5))
        val subject = Subject("English")
        db.addNewStudent("Alex", marks)

        db.addSubject("Alex", subject, 5)

        val subjects = db.getSubjects()
        val students = db.getStudents()
        assert(subjects.containsKey(subject))
    }
}