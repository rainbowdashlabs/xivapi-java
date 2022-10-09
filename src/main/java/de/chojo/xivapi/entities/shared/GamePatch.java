package de.chojo.xivapi.entities.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GamePatch(@JsonProperty("Banner") String banner,
                        @JsonProperty("ExName") String exName,
                        @JsonProperty("ExVersion") int exVersion,
                        @JsonProperty("ID") int id,
                        @JsonProperty("IsExpansion") boolean isExpansion,
                        @JsonProperty("Name") String name,
                        @JsonProperty("Name_cn") String nameCn,
                        @JsonProperty("Name_de") String nameDe,
                        @JsonProperty("Name_en") String nameEn,
                        @JsonProperty("Name_fr") String nameFr,
                        @JsonProperty("Name_ja") String nameJa,
                        @JsonProperty("Name_kr") String nameKr,
                        @JsonProperty("PatchNotes") String PatchNotes,
                        @JsonProperty("PatchNotes_de") String patchNotesDe,
                        @JsonProperty("PatchNotes_en") String patchNotesEn,
                        @JsonProperty("PatchNotes_fr") String patchNotesFr,
                        @JsonProperty("PatchNotes_ja") String patchNotesJa,
                        @JsonProperty("ReleaseDate") int releaseDate,
                        @JsonProperty("Url") String url,
                        @JsonProperty("Version") String version) {
}
