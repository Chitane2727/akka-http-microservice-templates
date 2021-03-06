package org.akka.templates

import org.akka.templates.response.Greeting

/**
  * @author Gabriel Francisco <gabfssilva@gmail.com>
  */
package object validators extends BaseValidator {
  import com.wix.accord.dsl._

  implicit val greetingValidator = validator[Greeting] { greeting =>
    greeting.greeting.orNull is notBlank
    greeting.name.orNull is notBlank
  }
}
