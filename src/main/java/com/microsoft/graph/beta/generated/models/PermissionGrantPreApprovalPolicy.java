package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PermissionGrantPreApprovalPolicy extends DirectoryObject implements Parsable {
    /**
     * Instantiates a new {@link PermissionGrantPreApprovalPolicy} and sets the default values.
     */
    public PermissionGrantPreApprovalPolicy() {
        super();
        this.setOdataType("#microsoft.graph.permissionGrantPreApprovalPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PermissionGrantPreApprovalPolicy}
     */
    @jakarta.annotation.Nonnull
    public static PermissionGrantPreApprovalPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PermissionGrantPreApprovalPolicy();
    }
    /**
     * Gets the conditions property value. A list of condition sets describing the conditions under which the permission to grant consent for the app has been preapproved.
     * @return a {@link java.util.List<PreApprovalDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PreApprovalDetail> getConditions() {
        return this.backingStore.get("conditions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("conditions", (n) -> { this.setConditions(n.getCollectionOfObjectValues(PreApprovalDetail::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("conditions", this.getConditions());
    }
    /**
     * Sets the conditions property value. A list of condition sets describing the conditions under which the permission to grant consent for the app has been preapproved.
     * @param value Value to set for the conditions property.
     */
    public void setConditions(@jakarta.annotation.Nullable final java.util.List<PreApprovalDetail> value) {
        this.backingStore.set("conditions", value);
    }
}
