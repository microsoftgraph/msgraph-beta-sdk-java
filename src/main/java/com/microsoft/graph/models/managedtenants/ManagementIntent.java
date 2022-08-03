package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
/** Provides operations to manage the collection of activityStatistics entities. */
public class ManagementIntent extends Entity implements Parsable {
    /** The display name for the management intent. Optional. Read-only. */
    private String _displayName;
    /** A flag indicating whether the management intent is global. Required. Read-only. */
    private Boolean _isGlobal;
    /** The collection of management templates associated with the management intent. Optional. Read-only. */
    private java.util.List<ManagementTemplateDetailedInfo> _managementTemplates;
    /**
     * Instantiates a new managementIntent and sets the default values.
     * @return a void
     */
    public ManagementIntent() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.managementIntent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementIntent
     */
    @javax.annotation.Nonnull
    public static ManagementIntent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementIntent();
    }
    /**
     * Gets the displayName property value. The display name for the management intent. Optional. Read-only.
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
        final ManagementIntent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("isGlobal", (n) -> { currentObject.setIsGlobal(n.getBooleanValue()); });
            this.put("managementTemplates", (n) -> { currentObject.setManagementTemplates(n.getCollectionOfObjectValues(ManagementTemplateDetailedInfo::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isGlobal property value. A flag indicating whether the management intent is global. Required. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsGlobal() {
        return this._isGlobal;
    }
    /**
     * Gets the managementTemplates property value. The collection of management templates associated with the management intent. Optional. Read-only.
     * @return a managementTemplateDetailedInfo
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementTemplateDetailedInfo> getManagementTemplates() {
        return this._managementTemplates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isGlobal", this.getIsGlobal());
        writer.writeCollectionOfObjectValues("managementTemplates", this.getManagementTemplates());
    }
    /**
     * Sets the displayName property value. The display name for the management intent. Optional. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isGlobal property value. A flag indicating whether the management intent is global. Required. Read-only.
     * @param value Value to set for the isGlobal property.
     * @return a void
     */
    public void setIsGlobal(@javax.annotation.Nullable final Boolean value) {
        this._isGlobal = value;
    }
    /**
     * Sets the managementTemplates property value. The collection of management templates associated with the management intent. Optional. Read-only.
     * @param value Value to set for the managementTemplates property.
     * @return a void
     */
    public void setManagementTemplates(@javax.annotation.Nullable final java.util.List<ManagementTemplateDetailedInfo> value) {
        this._managementTemplates = value;
    }
}
