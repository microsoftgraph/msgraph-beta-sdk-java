package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeploymentSettings implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new DeploymentSettings and sets the default values.
     */
    public DeploymentSettings() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeploymentSettings
     */
    @jakarta.annotation.Nonnull
    public static DeploymentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeploymentSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the contentApplicability property value. Settings for governing whether content is applicable to a device.
     * @return a ContentApplicabilitySettings
     */
    @jakarta.annotation.Nullable
    public ContentApplicabilitySettings getContentApplicability() {
        return this.backingStore.get("contentApplicability");
    }
    /**
     * Gets the expedite property value. Settings for governing whether updates should be expedited.
     * @return a ExpediteSettings
     */
    @jakarta.annotation.Nullable
    public ExpediteSettings getExpedite() {
        return this.backingStore.get("expedite");
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
     * @return a MonitoringSettings
     */
    @jakarta.annotation.Nullable
    public MonitoringSettings getMonitoring() {
        return this.backingStore.get("monitoring");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the schedule property value. Settings for governing how and when the content is rolled out.
     * @return a ScheduleSettings
     */
    @jakarta.annotation.Nullable
    public ScheduleSettings getSchedule() {
        return this.backingStore.get("schedule");
    }
    /**
     * Gets the userExperience property value. Settings for governing end user update experience.
     * @return a UserExperienceSettings
     */
    @jakarta.annotation.Nullable
    public UserExperienceSettings getUserExperience() {
        return this.backingStore.get("userExperience");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the contentApplicability property value. Settings for governing whether content is applicable to a device.
     * @param value Value to set for the contentApplicability property.
     */
    public void setContentApplicability(@jakarta.annotation.Nullable final ContentApplicabilitySettings value) {
        this.backingStore.set("contentApplicability", value);
    }
    /**
     * Sets the expedite property value. Settings for governing whether updates should be expedited.
     * @param value Value to set for the expedite property.
     */
    public void setExpedite(@jakarta.annotation.Nullable final ExpediteSettings value) {
        this.backingStore.set("expedite", value);
    }
    /**
     * Sets the monitoring property value. Settings for governing conditions to monitor and automated actions to take.
     * @param value Value to set for the monitoring property.
     */
    public void setMonitoring(@jakarta.annotation.Nullable final MonitoringSettings value) {
        this.backingStore.set("monitoring", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the schedule property value. Settings for governing how and when the content is rolled out.
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final ScheduleSettings value) {
        this.backingStore.set("schedule", value);
    }
    /**
     * Sets the userExperience property value. Settings for governing end user update experience.
     * @param value Value to set for the userExperience property.
     */
    public void setUserExperience(@jakarta.annotation.Nullable final UserExperienceSettings value) {
        this.backingStore.set("userExperience", value);
    }
}
