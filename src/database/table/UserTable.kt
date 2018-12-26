package database.table

import kotlinx.css.time
import org.jetbrains.exposed.sql.Table

object UserTable : Table() {
    val id = varchar("id", 100).primaryKey()
    val password = varchar("password", 20)
    val createdAt = long("time_stamp").default(System.currentTimeMillis())
}