/*
 *     This file is part of Discord4J.
 *
 *     Discord4J is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Discord4J is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with Discord4J.  If not, see <http://www.gnu.org/licenses/>.
 */

package sx.blah.discord.handle.obj;

/**
 * This represents an object which is associated with an id.
 */
public interface IIDLinkedObject {

	/**
	 * Gets the snowflake unique id for this object.
	 *
	 * @return The id.
	 *
	 * @see #getLongID()
	 */
	default long getID() {
		return getLongID();
	}

	/**
	 * Gets the <b>unsigned</b> long value of the id for this object.
	 *
	 * @return The id.
	 */
	long getLongID();

	/**
	 * Gets the snowflake unique id for this object.
	 *
	 * @return The id.
	 */
	default String getStringID() {
		return Long.toUnsignedString(getLongID());
	}
}
