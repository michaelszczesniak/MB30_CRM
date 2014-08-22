package config

import com.typesafe.config.Config

/**
 * Created by work on 8/15/14.
 */

object ConfigPaths {

  final val postgres: String = "postgres"

  def withPath[T](config: Config, path: String)(body: Config => T): T = {
    val c = config.getConfig(path)
    body(c)
  }
}

case class PostgresConfig(username: String,
                          password: String,
                          url: String,
                          port: String,
                          db: String)

object PostgresConfig {

  def fromConfig(config: Config): PostgresConfig = {
    PostgresConfig(username = config.getString("username"),
      password = config.getString("password"),
      url = config.getString("url"),
      port = config.getString("port"),
      db = config.getString("db"))
  }
}
