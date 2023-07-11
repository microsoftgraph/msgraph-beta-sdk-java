package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The AAD Group we are deploying firmware updates to
 */
public class AndroidFotaDeploymentAssignmentTarget extends DeviceAndAppManagementAssignmentTarget implements Parsable {
    /**
     * AAD Group Id.
     */
    private String groupId;
    /**
     * Instantiates a new androidFotaDeploymentAssignmentTarget and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidFotaDeploymentAssignmentTarget() {
        super();
        this.setOdataType("#microsoft.graph.androidFotaDeploymentAssignmentTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidFotaDeploymentAssignmentTarget
     */
    @javax.annotation.Nonnull
    public static AndroidFotaDeploymentAssignmentTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidFotaDeploymentAssignmentTarget();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupId property value. AAD Group Id.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupId() {
        return this.groupId;
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
        writer.writeStringValue("groupId", this.getGroupId());
    }
    /**
     * Sets the groupId property value. AAD Group Id.
     * @param value Value to set for the groupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupId(@javax.annotation.Nullable final String value) {
        this.groupId = value;
    }
}
