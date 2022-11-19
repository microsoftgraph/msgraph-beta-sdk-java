package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RoleMembershipGovernanceCriteria extends GovernanceCriteria implements Parsable {
    /** The roleId property */
    private String _roleId;
    /** The roleTemplateId property */
    private String _roleTemplateId;
    /**
     * Instantiates a new RoleMembershipGovernanceCriteria and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RoleMembershipGovernanceCriteria() {
        super();
        this.setOdataType("#microsoft.graph.roleMembershipGovernanceCriteria");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RoleMembershipGovernanceCriteria
     */
    @javax.annotation.Nonnull
    public static RoleMembershipGovernanceCriteria createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleMembershipGovernanceCriteria();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RoleMembershipGovernanceCriteria currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("roleId", (n) -> { currentObject.setRoleId(n.getStringValue()); });
        deserializerMap.put("roleTemplateId", (n) -> { currentObject.setRoleTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the roleId property value. The roleId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleId() {
        return this._roleId;
    }
    /**
     * Gets the roleTemplateId property value. The roleTemplateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRoleTemplateId() {
        return this._roleTemplateId;
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
        writer.writeStringValue("roleId", this.getRoleId());
        writer.writeStringValue("roleTemplateId", this.getRoleTemplateId());
    }
    /**
     * Sets the roleId property value. The roleId property
     * @param value Value to set for the roleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleId(@javax.annotation.Nullable final String value) {
        this._roleId = value;
    }
    /**
     * Sets the roleTemplateId property value. The roleTemplateId property
     * @param value Value to set for the roleTemplateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleTemplateId(@javax.annotation.Nullable final String value) {
        this._roleTemplateId = value;
    }
}
