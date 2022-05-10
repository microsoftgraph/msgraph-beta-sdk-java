package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkloadAction implements AdditionalDataHolder, Parsable {
    /** The unique identifier for the workload action. Required. Read-only. */
    private String _actionId;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The category for the workload action. Possible values are: automated, manual, unknownFutureValue. Optional. Read-only. */
    private WorkloadActionCategory _category;
    /** The description for the workload action. Optional. Read-only. */
    private String _description;
    /** The display name for the workload action. Optional. Read-only. */
    private String _displayName;
    /** The licenses property */
    private java.util.List<String> _licenses;
    /** The service associated with workload action. Optional. Read-only. */
    private String _service;
    /** The collection of settings associated with the workload action. Optional. Read-only. */
    private java.util.List<Setting> _settings;
    /**
     * Instantiates a new workloadAction and sets the default values.
     * @return a void
     */
    public WorkloadAction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workloadAction
     */
    @javax.annotation.Nonnull
    public static WorkloadAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkloadAction();
    }
    /**
     * Gets the actionId property value. The unique identifier for the workload action. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getActionId() {
        return this._actionId;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the category property value. The category for the workload action. Possible values are: automated, manual, unknownFutureValue. Optional. Read-only.
     * @return a workloadActionCategory
     */
    @javax.annotation.Nullable
    public WorkloadActionCategory getCategory() {
        return this._category;
    }
    /**
     * Gets the description property value. The description for the workload action. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name for the workload action. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WorkloadAction currentObject = this;
        return new HashMap<>(7) {{
            this.put("actionId", (n) -> { currentObject.setActionId(n.getStringValue()); });
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(WorkloadActionCategory.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("licenses", (n) -> { currentObject.setLicenses(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("service", (n) -> { currentObject.setService(n.getStringValue()); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getCollectionOfObjectValues(Setting::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the licenses property value. The licenses property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getLicenses() {
        return this._licenses;
    }
    /**
     * Gets the service property value. The service associated with workload action. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getService() {
        return this._service;
    }
    /**
     * Gets the settings property value. The collection of settings associated with the workload action. Optional. Read-only.
     * @return a setting
     */
    @javax.annotation.Nullable
    public java.util.List<Setting> getSettings() {
        return this._settings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionId", this.getActionId());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("licenses", this.getLicenses());
        writer.writeStringValue("service", this.getService());
        writer.writeCollectionOfObjectValues("settings", this.getSettings());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionId property value. The unique identifier for the workload action. Required. Read-only.
     * @param value Value to set for the actionId property.
     * @return a void
     */
    public void setActionId(@javax.annotation.Nullable final String value) {
        this._actionId = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the category property value. The category for the workload action. Possible values are: automated, manual, unknownFutureValue. Optional. Read-only.
     * @param value Value to set for the category property.
     * @return a void
     */
    public void setCategory(@javax.annotation.Nullable final WorkloadActionCategory value) {
        this._category = value;
    }
    /**
     * Sets the description property value. The description for the workload action. Optional. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name for the workload action. Optional. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the licenses property value. The licenses property
     * @param value Value to set for the licenses property.
     * @return a void
     */
    public void setLicenses(@javax.annotation.Nullable final java.util.List<String> value) {
        this._licenses = value;
    }
    /**
     * Sets the service property value. The service associated with workload action. Optional. Read-only.
     * @param value Value to set for the service property.
     * @return a void
     */
    public void setService(@javax.annotation.Nullable final String value) {
        this._service = value;
    }
    /**
     * Sets the settings property value. The collection of settings associated with the workload action. Optional. Read-only.
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final java.util.List<Setting> value) {
        this._settings = value;
    }
}
