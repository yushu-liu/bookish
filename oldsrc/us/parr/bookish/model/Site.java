package us.parr.bookish.model;

import us.parr.bookish.entity.SiteDef;

public class Site extends OutputModelObject {
	public SiteDef def;

	public Site(SiteDef def) {
		this.def = def;
	}
}
