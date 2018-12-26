package database.table

import org.jetbrains.exposed.sql.Table

object AuthTable : Table() {
    val accessToken = varchar("accessToken", 100).primaryKey()
    val refreshToken = varchar("refreshToken", 100)
}