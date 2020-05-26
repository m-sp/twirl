addSbtPlugin("com.typesafe.play" % "interplay" % sys.props.get("interplay.version").getOrElse("3.0.0"))

// For the Cross Build
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.33")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")

addSbtPlugin("com.typesafe"      % "sbt-mima-plugin" % "0.7.0")
addSbtPlugin("de.heikoseeberger" % "sbt-header"      % "5.6.0")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"    % "2.4.0")

addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.0.0")
