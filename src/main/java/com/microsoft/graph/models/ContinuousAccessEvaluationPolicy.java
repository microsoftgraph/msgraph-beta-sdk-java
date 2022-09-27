package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ContinuousAccessEvaluationPolicy extends Entity implements Parsable {
    /** Continuous access evaluation automatically blocks access to resources and applications in near real time when a user's access is removed or a client IP address changes. Read-only. */
    private String _description;
    /** The value is always Continuous Access Evaluation. Read-only. */
    private String _displayName;
    /** The collection of group identifiers in scope for evaluation. All groups are in scope when the collection is empty. Read-only. */
    private java.util.List<String> _groups;
    /** true to indicate whether continuous access evaluation should be performed; otherwise false. Read-only. */
    private Boolean _isEnabled;
    /** true to indicate that the continuous access evaluation policy settings should be or has been migrated to the conditional access policy. */
    private Boolean _migrate;
    /** The collection of user identifiers in scope for evaluation. All users are in scope when the collection is empty. Read-only. */
    private java.util.List<String> _users;
    /**
     * Instantiates a new ContinuousAccessEvaluationPolicy and sets the default values.
     * @return a void
     */
    public ContinuousAccessEvaluationPolicy() {
        super();
        this.setOdataType("#microsoft.graph.continuousAccessEvaluationPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ContinuousAccessEvaluationPolicy
     */
    @javax.annotation.Nonnull
    public static ContinuousAccessEvaluationPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContinuousAccessEvaluationPolicy();
    }
    /**
     * Gets the description property value. Continuous access evaluation automatically blocks access to resources and applications in near real time when a user's access is removed or a client IP address changes. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The value is always Continuous Access Evaluation. Read-only.
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
        final ContinuousAccessEvaluationPolicy currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("groups", (n) -> { currentObject.setGroups(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("isEnabled", (n) -> { currentObject.setIsEnabled(n.getBooleanValue()); });
            this.put("migrate", (n) -> { currentObject.setMigrate(n.getBooleanValue()); });
            this.put("users", (n) -> { currentObject.setUsers(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the groups property value. The collection of group identifiers in scope for evaluation. All groups are in scope when the collection is empty. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getGroups() {
        return this._groups;
    }
    /**
     * Gets the isEnabled property value. true to indicate whether continuous access evaluation should be performed; otherwise false. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this._isEnabled;
    }
    /**
     * Gets the migrate property value. true to indicate that the continuous access evaluation policy settings should be or has been migrated to the conditional access policy.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMigrate() {
        return this._migrate;
    }
    /**
     * Gets the users property value. The collection of user identifiers in scope for evaluation. All users are in scope when the collection is empty. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getUsers() {
        return this._users;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("groups", this.getGroups());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeBooleanValue("migrate", this.getMigrate());
        writer.writeCollectionOfPrimitiveValues("users", this.getUsers());
    }
    /**
     * Sets the description property value. Continuous access evaluation automatically blocks access to resources and applications in near real time when a user's access is removed or a client IP address changes. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The value is always Continuous Access Evaluation. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the groups property value. The collection of group identifiers in scope for evaluation. All groups are in scope when the collection is empty. Read-only.
     * @param value Value to set for the groups property.
     * @return a void
     */
    public void setGroups(@javax.annotation.Nullable final java.util.List<String> value) {
        this._groups = value;
    }
    /**
     * Sets the isEnabled property value. true to indicate whether continuous access evaluation should be performed; otherwise false. Read-only.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isEnabled = value;
    }
    /**
     * Sets the migrate property value. true to indicate that the continuous access evaluation policy settings should be or has been migrated to the conditional access policy.
     * @param value Value to set for the migrate property.
     * @return a void
     */
    public void setMigrate(@javax.annotation.Nullable final Boolean value) {
        this._migrate = value;
    }
    /**
     * Sets the users property value. The collection of user identifiers in scope for evaluation. All users are in scope when the collection is empty. Read-only.
     * @param value Value to set for the users property.
     * @return a void
     */
    public void setUsers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._users = value;
    }
}
