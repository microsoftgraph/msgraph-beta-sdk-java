package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsUser extends AwsIdentity implements Parsable {
    /**
     * Instantiates a new AwsUser and sets the default values.
     */
    public AwsUser() {
        super();
        this.setOdataType("#microsoft.graph.awsUser");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsUser
     */
    @jakarta.annotation.Nonnull
    public static AwsUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsUser();
    }
    /**
     * Gets the assumableRoles property value. Roles assumed by the user.
     * @return a java.util.List<AwsRole>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AwsRole> getAssumableRoles() {
        return this.backingStore.get("assumableRoles");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assumableRoles", (n) -> { this.setAssumableRoles(n.getCollectionOfObjectValues(AwsRole::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("assumableRoles", this.getAssumableRoles());
    }
    /**
     * Sets the assumableRoles property value. Roles assumed by the user.
     * @param value Value to set for the assumableRoles property.
     */
    public void setAssumableRoles(@jakarta.annotation.Nullable final java.util.List<AwsRole> value) {
        this.backingStore.set("assumableRoles", value);
    }
}
