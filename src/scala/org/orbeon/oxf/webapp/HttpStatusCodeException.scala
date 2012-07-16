/**
 * Copyright (C) 2012 Orbeon, Inc.
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation; either version
 * 2.1 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * The full text of the license is available at http://www.gnu.org/copyleft/lesser.html
 */
package org.orbeon.oxf.webapp

import org.orbeon.oxf.util.ScalaUtils._
import org.orbeon.oxf.util.NetUtils

trait HttpStatusCode extends RuntimeException { def code: Int }

case class HttpStatusCodeException(code: Int, resource: Option[String] = None) extends HttpStatusCode

case class HttpRedirectException(location: String, serverSide: Boolean = false, exitPortal: Boolean = false) extends HttpStatusCode {
    val code = 302
    def path = splitQuery(location)._1
    def jParameters = splitQuery(location)._2 map (NetUtils.decodeQueryString(_, false))
}