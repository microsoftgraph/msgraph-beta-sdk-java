package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class TenantGroup extends Entity implements Parsable {
    /** A flag indicating whether all managed tenant are included in the tenant group. Required. Read-only. */
    private Boolean _allTenantsIncluded;
    /** The display name for the tenant group. Optional. Read-only. */
    private String _displayName;
    /** The collection of management action associated with the tenant group. Optional. Read-only. */
    private java.util.List<ManagementActionInfo> _managementActions;
    /** The collection of management intents associated with the tenant group. Optional. Read-only. */
    private java.util.List<ManagementIntentInfo> _managementIntents;
    /** The collection of managed tenant identifiers include in the tenant group. Optional. Read-only. */
    private java.util.List<String> _tenantIds;
    /**
     * Instantiates a new tenantGroup and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TenantGroup() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.tenantGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantGroup
     */
    @javax.annotation.Nonnull
    public static TenantGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantGroup();
    }
    /**
     * Gets the allTenantsIncluded property value. A flag indicating whether all managed tenant are included in the tenant group. Required. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllTenantsIncluded() {
        return this._allTenantsIncluded;
    }
    /**
     * Gets the displayName property value. The display name for the tenant group. Optional. Read-only.
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
        final TenantGroup currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("allTenantsIncluded", (n) -> { currentObject.setAllTenantsIncluded(n.getBooleanValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("managementActions", (n) -> { currentObject.setManagementActions(n.getCollectionOfObjectValues(ManagementActionInfo::createFromDiscriminatorValue)); });
            this.put("managementIntents", (n) -> { currentObject.setManagementIntents(n.getCollectionOfObjectValues(ManagementIntentInfo::createFromDiscriminatorValue)); });
            this.put("tenantIds", (n) -> { currentObject.setTenantIds(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the managementActions property value. The collection of management action associated with the tenant group. Optional. Read-only.
     * @return a managementActionInfo
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementActionInfo> getManagementActions() {
        return this._managementActions;
    }
    /**
     * Gets the managementIntents property value. The collection of management intents associated with the tenant group. Optional. Read-only.
     * @return a managementIntentInfo
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementIntentInfo> getManagementIntents() {
        return this._managementIntents;
    }
    /**
     * Gets the tenantIds property value. The collection of managed tenant identifiers include in the tenant group. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTenantIds() {
        return this._tenantIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allTenantsIncluded", this.getAllTenantsIncluded());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("managementActions", this.getManagementActions());
        writer.writeCollectionOfObjectValues("managementIntents", this.getManagementIntents());
        writer.writeCollectionOfPrimitiveValues("tenantIds", this.getTenantIds());
    }
    /**
     * Sets the allTenantsIncluded property value. A flag indicating whether all managed tenant are included in the tenant group. Required. Read-only.
     * @param value Value to set for the allTenantsIncluded property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllTenantsIncluded(@javax.annotation.Nullable final Boolean value) {
        this._allTenantsIncluded = value;
    }
    /**
     * Sets the displayName property value. The display name for the tenant group. Optional. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the managementActions property value. The collection of management action associated with the tenant group. Optional. Read-only.
     * @param value Value to set for the managementActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementActions(@javax.annotation.Nullable final java.util.List<ManagementActionInfo> value) {
        this._managementActions = value;
    }
    /**
     * Sets the managementIntents property value. The collection of management intents associated with the tenant group. Optional. Read-only.
     * @param value Value to set for the managementIntents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementIntents(@javax.annotation.Nullable final java.util.List<ManagementIntentInfo> value) {
        this._managementIntents = value;
    }
    /**
     * Sets the tenantIds property value. The collection of managed tenant identifiers include in the tenant group. Optional. Read-only.
     * @param value Value to set for the tenantIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._tenantIds = value;
    }
}
