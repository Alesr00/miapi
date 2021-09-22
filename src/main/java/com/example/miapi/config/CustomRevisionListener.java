package com.example.miapi.config;

import org.hibernate.envers.RevisionListener;

import com.example.miapi.entities.audit.Revision;

public class CustomRevisionListener implements RevisionListener {
	
	public void newRevision (Object revisionEntity) { final Revision revision=(Revision) revisionEntity; }

}
