package info.guardianproject.mrapp;

import info.guardianproject.mrapp.model.Media;
import info.guardianproject.mrapp.model.Project;

import java.util.ArrayList;

//used to delete a project's media on storage
public class ProjectCleaner {
	
	public static void clean (Project project)
	{
		// FIXME default to use first scene
		ArrayList<Media> alMedia = project.getScenesAsArray()[0].getMediaAsList();
		
	}

}
