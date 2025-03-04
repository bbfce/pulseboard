package org.goblintelligence.pulseboard.services.project.data.dto;

import org.goblintelligence.pulseboard.services.project.data.entity.ProjectWithPermissionProjection;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectMapper INSTANCE = Mappers.getMapper(ProjectMapper.class);

    ProjectData fromProjectWithPermissionToProjectData(ProjectWithPermissionProjection projectWithPermissionProjection);
    List<ProjectData> fromProjectWithPermissionListToProjectDataList(List<ProjectWithPermissionProjection> projectWithPermissionProjection);
}
