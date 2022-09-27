package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrivilegedRole extends Entity implements Parsable {
    /** The assignments for this role. Read-only. Nullable. */
    private java.util.List<PrivilegedRoleAssignment> _assignments;
    /** Role name. */
    private String _name;
    /** The settings for this role. Read-only. Nullable. */
    private PrivilegedRoleSettings _settings;
    /** The summary information for this role. Read-only. Nullable. */
    private PrivilegedRoleSummary _summary;
    /**
     * Instantiates a new privilegedRole and sets the default values.
     * @return a void
     */
    public PrivilegedRole() {
        super();
        this.setOdataType("#microsoft.graph.privilegedRole");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a privilegedRole
     */
    @javax.annotation.Nonnull
    public static PrivilegedRole createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrivilegedRole();
    }
    /**
     * Gets the assignments property value. The assignments for this role. Read-only. Nullable.
     * @return a privilegedRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<PrivilegedRoleAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PrivilegedRole currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(PrivilegedRoleAssignment::createFromDiscriminatorValue)); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(PrivilegedRoleSettings::createFromDiscriminatorValue)); });
            this.put("summary", (n) -> { currentObject.setSummary(n.getObjectValue(PrivilegedRoleSummary::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the name property value. Role name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the settings property value. The settings for this role. Read-only. Nullable.
     * @return a privilegedRoleSettings
     */
    @javax.annotation.Nullable
    public PrivilegedRoleSettings getSettings() {
        return this._settings;
    }
    /**
     * Gets the summary property value. The summary information for this role. Read-only. Nullable.
     * @return a privilegedRoleSummary
     */
    @javax.annotation.Nullable
    public PrivilegedRoleSummary getSummary() {
        return this._summary;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeObjectValue("summary", this.getSummary());
    }
    /**
     * Sets the assignments property value. The assignments for this role. Read-only. Nullable.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<PrivilegedRoleAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the name property value. Role name.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the settings property value. The settings for this role. Read-only. Nullable.
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final PrivilegedRoleSettings value) {
        this._settings = value;
    }
    /**
     * Sets the summary property value. The summary information for this role. Read-only. Nullable.
     * @param value Value to set for the summary property.
     * @return a void
     */
    public void setSummary(@javax.annotation.Nullable final PrivilegedRoleSummary value) {
        this._summary = value;
    }
}
