package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsActionsPermissionsDefinitionAction extends AwsPermissionsDefinitionAction implements Parsable {
    /**
     * Instantiates a new {@link AwsActionsPermissionsDefinitionAction} and sets the default values.
     */
    public AwsActionsPermissionsDefinitionAction() {
        super();
        this.setOdataType("#microsoft.graph.awsActionsPermissionsDefinitionAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AwsActionsPermissionsDefinitionAction}
     */
    @jakarta.annotation.Nonnull
    public static AwsActionsPermissionsDefinitionAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsActionsPermissionsDefinitionAction();
    }
    /**
     * Gets the assignToRoleId property value. Defines AWS statements.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignToRoleId() {
        return this.backingStore.get("assignToRoleId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignToRoleId", (n) -> { this.setAssignToRoleId(n.getStringValue()); });
        deserializerMap.put("statements", (n) -> { this.setStatements(n.getCollectionOfObjectValues(AwsStatement::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the statements property value. The statements property
     * @return a {@link java.util.List<AwsStatement>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AwsStatement> getStatements() {
        return this.backingStore.get("statements");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("assignToRoleId", this.getAssignToRoleId());
        writer.writeCollectionOfObjectValues("statements", this.getStatements());
    }
    /**
     * Sets the assignToRoleId property value. Defines AWS statements.
     * @param value Value to set for the assignToRoleId property.
     */
    public void setAssignToRoleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("assignToRoleId", value);
    }
    /**
     * Sets the statements property value. The statements property
     * @param value Value to set for the statements property.
     */
    public void setStatements(@jakarta.annotation.Nullable final java.util.List<AwsStatement> value) {
        this.backingStore.set("statements", value);
    }
}
