package com.ece150.scavengerhunt;

import com.ece150.scavengerhunt.IObjective;
import java.util.List;

public interface IUser {
    /* Current Score */
    int getScore();

    /* Visited objectives, confirmed on location data */
    List<IObjective> getLocationObjectives();

    /* Visited objectives, confirmed on matched image */
    List<IObjective> getVisualObjectives();
}
