package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class ManagementAction extends Entity implements Parsable {
    /** The category for the management action. Possible values are: custom, devices, identity, unknownFutureValue. Optional. Read-only.  */
    private ManagementCategory _category;
    /** The description for the management action. Optional. Read-only.  */
    private String _description;
    /** The display name for the management action. Optional. Read-only.  */
    private String _displayName;
    /** The reference for the management template used to generate the management action. Required. Read-only.  */
    private String _referenceTemplateId;
    /** The referenceTemplateVersion property  */
    private Integer _referenceTemplateVersion;
    /** The collection of workload actions associated with the management action. Required. Read-only.  */
    private java.util.List<WorkloadAction> _workloadActions;
    /**
     * Instantiates a new managementAction and sets the default values.
     * @return a void
     */
    public ManagementAction() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementAction
     */
    @javax.annotation.Nonnull
    public static ManagementAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementAction();
    }
    /**
     * Gets the category property value. The category for the management action. Possible values are: custom, devices, identity, unknownFutureValue. Optional. Read-only.
     * @return a managementCategory
     */
    @javax.annotation.Nullable
    public ManagementCategory getCategory() {
        return this._category;
    }
    /**
     * Gets the description property value. The description for the management action. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name for the management action. Optional. Read-only.
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
        final ManagementAction currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(ManagementCategory.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("referenceTemplateId", (n) -> { currentObject.setReferenceTemplateId(n.getStringValue()); });
            this.put("referenceTemplateVersion", (n) -> { currentObject.setReferenceTemplateVersion(n.getIntegerValue()); });
            this.put("workloadActions", (n) -> { currentObject.setWorkloadActions(n.getCollectionOfObjectValues(WorkloadAction::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the referenceTemplateId property value. The reference for the management template used to generate the management action. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReferenceTemplateId() {
        return this._referenceTemplateId;
    }
    /**
     * Gets the referenceTemplateVersion property value. The referenceTemplateVersion property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getReferenceTemplateVersion() {
        return this._referenceTemplateVersion;
    }
    /**
     * Gets the workloadActions property value. The collection of workload actions associated with the management action. Required. Read-only.
     * @return a workloadAction
     */
    @javax.annotation.Nullable
    public java.util.List<WorkloadAction> getWorkloadActions() {
        return this._workloadActions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("referenceTemplateId", this.getReferenceTemplateId());
        writer.writeIntegerValue("referenceTemplateVersion", this.getReferenceTemplateVersion());
        writer.writeCollectionOfObjectValues("workloadActions", this.getWorkloadActions());
    }
    /**
     * Sets the category property value. The category for the management action. Possible values are: custom, devices, identity, unknownFutureValue. Optional. Read-only.
     * @param value Value to set for the category property.
     * @return a void
     */
    public void setCategory(@javax.annotation.Nullable final ManagementCategory value) {
        this._category = value;
    }
    /**
     * Sets the description property value. The description for the management action. Optional. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name for the management action. Optional. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the referenceTemplateId property value. The reference for the management template used to generate the management action. Required. Read-only.
     * @param value Value to set for the referenceTemplateId property.
     * @return a void
     */
    public void setReferenceTemplateId(@javax.annotation.Nullable final String value) {
        this._referenceTemplateId = value;
    }
    /**
     * Sets the referenceTemplateVersion property value. The referenceTemplateVersion property
     * @param value Value to set for the referenceTemplateVersion property.
     * @return a void
     */
    public void setReferenceTemplateVersion(@javax.annotation.Nullable final Integer value) {
        this._referenceTemplateVersion = value;
    }
    /**
     * Sets the workloadActions property value. The collection of workload actions associated with the management action. Required. Read-only.
     * @param value Value to set for the workloadActions property.
     * @return a void
     */
    public void setWorkloadActions(@javax.annotation.Nullable final java.util.List<WorkloadAction> value) {
        this._workloadActions = value;
    }
}
