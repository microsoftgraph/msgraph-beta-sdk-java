package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationSpeakerProgressResource extends EducationResource implements Parsable {
    /**
     * Instantiates a new {@link EducationSpeakerProgressResource} and sets the default values.
     */
    public EducationSpeakerProgressResource() {
        super();
        this.setOdataType("#microsoft.graph.educationSpeakerProgressResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationSpeakerProgressResource}
     */
    @jakarta.annotation.Nonnull
    public static EducationSpeakerProgressResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSpeakerProgressResource();
    }
    /**
     * Gets the aiFeedbackCriteria property value. The aiFeedbackCriteria property
     * @return a {@link EducationAiFeedbackCriteria}
     */
    @jakarta.annotation.Nullable
    public EducationAiFeedbackCriteria getAiFeedbackCriteria() {
        return this.backingStore.get("aiFeedbackCriteria");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("aiFeedbackCriteria", (n) -> { this.setAiFeedbackCriteria(n.getObjectValue(EducationAiFeedbackCriteria::createFromDiscriminatorValue)); });
        deserializerMap.put("isAiFeedbackEnabled", (n) -> { this.setIsAiFeedbackEnabled(n.getBooleanValue()); });
        deserializerMap.put("isVideoRequired", (n) -> { this.setIsVideoRequired(n.getBooleanValue()); });
        deserializerMap.put("maxRecordingAttempts", (n) -> { this.setMaxRecordingAttempts(n.getIntegerValue()); });
        deserializerMap.put("presentationTitle", (n) -> { this.setPresentationTitle(n.getStringValue()); });
        deserializerMap.put("recordingTimeLimitInMinutes", (n) -> { this.setRecordingTimeLimitInMinutes(n.getIntegerValue()); });
        deserializerMap.put("showRehearsalReportToStudentBeforeMediaUpload", (n) -> { this.setShowRehearsalReportToStudentBeforeMediaUpload(n.getBooleanValue()); });
        deserializerMap.put("speakerCoachSettings", (n) -> { this.setSpeakerCoachSettings(n.getObjectValue(EducationSpeakerCoachSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("spokenLanguageLocale", (n) -> { this.setSpokenLanguageLocale(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isAiFeedbackEnabled property value. The isAiFeedbackEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAiFeedbackEnabled() {
        return this.backingStore.get("isAiFeedbackEnabled");
    }
    /**
     * Gets the isVideoRequired property value. The isVideoRequired property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsVideoRequired() {
        return this.backingStore.get("isVideoRequired");
    }
    /**
     * Gets the maxRecordingAttempts property value. The maxRecordingAttempts property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxRecordingAttempts() {
        return this.backingStore.get("maxRecordingAttempts");
    }
    /**
     * Gets the presentationTitle property value. The presentationTitle property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPresentationTitle() {
        return this.backingStore.get("presentationTitle");
    }
    /**
     * Gets the recordingTimeLimitInMinutes property value. The recordingTimeLimitInMinutes property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRecordingTimeLimitInMinutes() {
        return this.backingStore.get("recordingTimeLimitInMinutes");
    }
    /**
     * Gets the showRehearsalReportToStudentBeforeMediaUpload property value. The showRehearsalReportToStudentBeforeMediaUpload property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShowRehearsalReportToStudentBeforeMediaUpload() {
        return this.backingStore.get("showRehearsalReportToStudentBeforeMediaUpload");
    }
    /**
     * Gets the speakerCoachSettings property value. The speakerCoachSettings property
     * @return a {@link EducationSpeakerCoachSettings}
     */
    @jakarta.annotation.Nullable
    public EducationSpeakerCoachSettings getSpeakerCoachSettings() {
        return this.backingStore.get("speakerCoachSettings");
    }
    /**
     * Gets the spokenLanguageLocale property value. The spokenLanguageLocale property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSpokenLanguageLocale() {
        return this.backingStore.get("spokenLanguageLocale");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("aiFeedbackCriteria", this.getAiFeedbackCriteria());
        writer.writeBooleanValue("isAiFeedbackEnabled", this.getIsAiFeedbackEnabled());
        writer.writeBooleanValue("isVideoRequired", this.getIsVideoRequired());
        writer.writeIntegerValue("maxRecordingAttempts", this.getMaxRecordingAttempts());
        writer.writeStringValue("presentationTitle", this.getPresentationTitle());
        writer.writeIntegerValue("recordingTimeLimitInMinutes", this.getRecordingTimeLimitInMinutes());
        writer.writeBooleanValue("showRehearsalReportToStudentBeforeMediaUpload", this.getShowRehearsalReportToStudentBeforeMediaUpload());
        writer.writeObjectValue("speakerCoachSettings", this.getSpeakerCoachSettings());
        writer.writeStringValue("spokenLanguageLocale", this.getSpokenLanguageLocale());
    }
    /**
     * Sets the aiFeedbackCriteria property value. The aiFeedbackCriteria property
     * @param value Value to set for the aiFeedbackCriteria property.
     */
    public void setAiFeedbackCriteria(@jakarta.annotation.Nullable final EducationAiFeedbackCriteria value) {
        this.backingStore.set("aiFeedbackCriteria", value);
    }
    /**
     * Sets the isAiFeedbackEnabled property value. The isAiFeedbackEnabled property
     * @param value Value to set for the isAiFeedbackEnabled property.
     */
    public void setIsAiFeedbackEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAiFeedbackEnabled", value);
    }
    /**
     * Sets the isVideoRequired property value. The isVideoRequired property
     * @param value Value to set for the isVideoRequired property.
     */
    public void setIsVideoRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isVideoRequired", value);
    }
    /**
     * Sets the maxRecordingAttempts property value. The maxRecordingAttempts property
     * @param value Value to set for the maxRecordingAttempts property.
     */
    public void setMaxRecordingAttempts(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maxRecordingAttempts", value);
    }
    /**
     * Sets the presentationTitle property value. The presentationTitle property
     * @param value Value to set for the presentationTitle property.
     */
    public void setPresentationTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("presentationTitle", value);
    }
    /**
     * Sets the recordingTimeLimitInMinutes property value. The recordingTimeLimitInMinutes property
     * @param value Value to set for the recordingTimeLimitInMinutes property.
     */
    public void setRecordingTimeLimitInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("recordingTimeLimitInMinutes", value);
    }
    /**
     * Sets the showRehearsalReportToStudentBeforeMediaUpload property value. The showRehearsalReportToStudentBeforeMediaUpload property
     * @param value Value to set for the showRehearsalReportToStudentBeforeMediaUpload property.
     */
    public void setShowRehearsalReportToStudentBeforeMediaUpload(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("showRehearsalReportToStudentBeforeMediaUpload", value);
    }
    /**
     * Sets the speakerCoachSettings property value. The speakerCoachSettings property
     * @param value Value to set for the speakerCoachSettings property.
     */
    public void setSpeakerCoachSettings(@jakarta.annotation.Nullable final EducationSpeakerCoachSettings value) {
        this.backingStore.set("speakerCoachSettings", value);
    }
    /**
     * Sets the spokenLanguageLocale property value. The spokenLanguageLocale property
     * @param value Value to set for the spokenLanguageLocale property.
     */
    public void setSpokenLanguageLocale(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("spokenLanguageLocale", value);
    }
}
