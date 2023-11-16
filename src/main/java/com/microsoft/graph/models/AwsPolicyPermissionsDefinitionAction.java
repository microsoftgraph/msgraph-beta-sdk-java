package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsPolicyPermissionsDefinitionAction extends AwsPermissionsDefinitionAction implements Parsable {
    /**
     * Instantiates a new AwsPolicyPermissionsDefinitionAction and sets the default values.
     */
    public AwsPolicyPermissionsDefinitionAction() {
        super();
        this.setOdataType("#microsoft.graph.awsPolicyPermissionsDefinitionAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsPolicyPermissionsDefinitionAction
     */
    @jakarta.annotation.Nonnull
    public static AwsPolicyPermissionsDefinitionAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsPolicyPermissionsDefinitionAction();
    }
    /**
     * Gets the assignToRoleId property value. The assignToRoleId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssignToRoleId() {
        return this.backingStore.get("assignToRoleId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignToRoleId", (n) -> { this.setAssignToRoleId(n.getStringValue()); });
        deserializerMap.put("policies", (n) -> { this.setPolicies(n.getCollectionOfObjectValues(PermissionsDefinitionAwsPolicy::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the policies property value. The policies property
     * @return a java.util.List<PermissionsDefinitionAwsPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PermissionsDefinitionAwsPolicy> getPolicies() {
        return this.backingStore.get("policies");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assignToRoleId", this.getAssignToRoleId());
        writer.writeCollectionOfObjectValues("policies", this.getPolicies());
    }
    /**
     * Sets the assignToRoleId property value. The assignToRoleId property
     * @param value Value to set for the assignToRoleId property.
     */
    public void setAssignToRoleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignToRoleId", value);
    }
    /**
     * Sets the policies property value. The policies property
     * @param value Value to set for the policies property.
     */
    public void setPolicies(@jakarta.annotation.Nullable final java.util.List<PermissionsDefinitionAwsPolicy> value) {
        this.backingStore.set("policies", value);
    }
}
