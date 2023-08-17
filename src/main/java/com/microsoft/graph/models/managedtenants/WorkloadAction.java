package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkloadAction implements AdditionalDataHolder, Parsable {
    /**
     * The unique identifier for the workload action. Required. Read-only.
     */
    private String actionId;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The category for the workload action. Possible values are: automated, manual, unknownFutureValue. Optional. Read-only.
     */
    private WorkloadActionCategory category;
    /**
     * The description for the workload action. Optional. Read-only.
     */
    private String description;
    /**
     * The display name for the workload action. Optional. Read-only.
     */
    private String displayName;
    /**
     * The licenses property
     */
    private java.util.List<String> licenses;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The service associated with workload action. Optional. Read-only.
     */
    private String service;
    /**
     * The collection of settings associated with the workload action. Optional. Read-only.
     */
    private java.util.List<Setting> settings;
    /**
     * Instantiates a new workloadAction and sets the default values.
     */
    public WorkloadAction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workloadAction
     */
    @jakarta.annotation.Nonnull
    public static WorkloadAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkloadAction();
    }
    /**
     * Gets the actionId property value. The unique identifier for the workload action. Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getActionId() {
        return this.actionId;
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
     * Gets the category property value. The category for the workload action. Possible values are: automated, manual, unknownFutureValue. Optional. Read-only.
     * @return a workloadActionCategory
     */
    @jakarta.annotation.Nullable
    public WorkloadActionCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the description property value. The description for the workload action. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The display name for the workload action. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("actionId", (n) -> { this.setActionId(n.getStringValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(WorkloadActionCategory.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("licenses", (n) -> { this.setLicenses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("service", (n) -> { this.setService(n.getStringValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getCollectionOfObjectValues(Setting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the licenses property value. The licenses property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLicenses() {
        return this.licenses;
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
     * Gets the service property value. The service associated with workload action. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getService() {
        return this.service;
    }
    /**
     * Gets the settings property value. The collection of settings associated with the workload action. Optional. Read-only.
     * @return a setting
     */
    @jakarta.annotation.Nullable
    public java.util.List<Setting> getSettings() {
        return this.settings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionId", this.getActionId());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("licenses", this.getLicenses());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("service", this.getService());
        writer.writeCollectionOfObjectValues("settings", this.getSettings());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionId property value. The unique identifier for the workload action. Required. Read-only.
     * @param value Value to set for the actionId property.
     */
    public void setActionId(@jakarta.annotation.Nullable final String value) {
        this.actionId = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the category property value. The category for the workload action. Possible values are: automated, manual, unknownFutureValue. Optional. Read-only.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final WorkloadActionCategory value) {
        this.category = value;
    }
    /**
     * Sets the description property value. The description for the workload action. Optional. Read-only.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The display name for the workload action. Optional. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the licenses property value. The licenses property
     * @param value Value to set for the licenses property.
     */
    public void setLicenses(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.licenses = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the service property value. The service associated with workload action. Optional. Read-only.
     * @param value Value to set for the service property.
     */
    public void setService(@jakarta.annotation.Nullable final String value) {
        this.service = value;
    }
    /**
     * Sets the settings property value. The collection of settings associated with the workload action. Optional. Read-only.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final java.util.List<Setting> value) {
        this.settings = value;
    }
}
