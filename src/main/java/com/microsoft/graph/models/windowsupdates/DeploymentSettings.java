package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeploymentSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Settings for governing whether content is applicable to a device.
     */
    private ContentApplicabilitySettings contentApplicability;
    /**
     * Settings for governing whether updates should be expedited.
     */
    private ExpediteSettings expedite;
    /**
     * Settings for governing conditions to monitor and automated actions to take.
     */
    private MonitoringSettings monitoring;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Settings for governing how and when the content is rolled out.
     */
    private ScheduleSettings schedule;
    /**
     * Settings for governing end user update experience.
     */
    private UserExperienceSettings userExperience;
    /**
     * Instantiates a new deploymentSettings and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public DeploymentSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deploymentSettings
     */
    @jakarta.annotation.Nonnull
    public static DeploymentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeploymentSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the contentApplicability property value. Settings for governing whether content is applicable to a device.
     * @return a contentApplicabilitySettings
     */
    @jakarta.annotation.Nullable
    public ContentApplicabilitySettings getContentApplicability() {
        return this.contentApplicability;
    }
    /**
     * Gets the expedite property value. Settings for governing whether updates should be expedited.
     * @return a expediteSettings
     */
    @jakarta.annotation.Nullable
    public ExpediteSettings getExpedite() {
        return this.expedite;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("contentApplicability", (n) -> { this.setContentApplicability(n.getObjectValue(ContentApplicabilitySettings::createFromDiscriminatorValue)); });
        deserializerMap.put("expedite", (n) -> { this.setExpedite(n.getObjectValue(ExpediteSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("monitoring", (n) -> { this.setMonitoring(n.getObjectValue(MonitoringSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(ScheduleSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("userExperience", (n) -> { this.setUserExperience(n.getObjectValue(UserExperienceSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the monitoring property value. Settings for governing conditions to monitor and automated actions to take.
     * @return a monitoringSettings
     */
    @jakarta.annotation.Nullable
    public MonitoringSettings getMonitoring() {
        return this.monitoring;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the schedule property value. Settings for governing how and when the content is rolled out.
     * @return a scheduleSettings
     */
    @jakarta.annotation.Nullable
    public ScheduleSettings getSchedule() {
        return this.schedule;
    }
    /**
     * Gets the userExperience property value. Settings for governing end user update experience.
     * @return a userExperienceSettings
     */
    @jakarta.annotation.Nullable
    public UserExperienceSettings getUserExperience() {
        return this.userExperience;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("contentApplicability", this.getContentApplicability());
        writer.writeObjectValue("expedite", this.getExpedite());
        writer.writeObjectValue("monitoring", this.getMonitoring());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeObjectValue("userExperience", this.getUserExperience());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the contentApplicability property value. Settings for governing whether content is applicable to a device.
     * @param value Value to set for the contentApplicability property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setContentApplicability(@jakarta.annotation.Nullable final ContentApplicabilitySettings value) {
        this.contentApplicability = value;
    }
    /**
     * Sets the expedite property value. Settings for governing whether updates should be expedited.
     * @param value Value to set for the expedite property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setExpedite(@jakarta.annotation.Nullable final ExpediteSettings value) {
        this.expedite = value;
    }
    /**
     * Sets the monitoring property value. Settings for governing conditions to monitor and automated actions to take.
     * @param value Value to set for the monitoring property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMonitoring(@jakarta.annotation.Nullable final MonitoringSettings value) {
        this.monitoring = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the schedule property value. Settings for governing how and when the content is rolled out.
     * @param value Value to set for the schedule property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setSchedule(@jakarta.annotation.Nullable final ScheduleSettings value) {
        this.schedule = value;
    }
    /**
     * Sets the userExperience property value. Settings for governing end user update experience.
     * @param value Value to set for the userExperience property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserExperience(@jakarta.annotation.Nullable final UserExperienceSettings value) {
        this.userExperience = value;
    }
}
