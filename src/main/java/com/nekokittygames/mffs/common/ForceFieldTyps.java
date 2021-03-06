/*  
    Copyright (C) 2012 Thunderdark

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    
    Contributors:
    
    Thunderdark
    Matchlighter

 */

package com.nekokittygames.mffs.common;

import net.minecraft.util.IStringSerializable;

public enum ForceFieldTyps implements IStringSerializable{
	Camouflage(2,"camoflage"), Default(1,"default"), Zapper(3,"zapper"), Area(1,"area"), Containment(1,"containment");

	int costmodi;
	String forceType;

	private ForceFieldTyps(int costmodi,String type) {

		this.costmodi = costmodi;
		this.forceType=type;

	}

	@Override
	public String getName()
	{
		return forceType;
	}

}
