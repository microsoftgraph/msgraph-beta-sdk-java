package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AwsAccessKey extends AwsIdentity implements Parsable {
    /**
     * Instantiates a new AwsAccessKey and sets the default values.
     */
    public AwsAccessKey() {
        super();
        this.setOdataType("#microsoft.graph.awsAccessKey");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AwsAccessKey
     */
    @jakarta.annotation.Nonnull
    public static AwsAccessKey createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AwsAccessKey();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getObjectValue(AwsUser::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the owner property value. The owner property
     * @return a AwsUser
     */
    @jakarta.annotation.Nullable
    public AwsUser getOwner() {
        return this.BackingStore.get("owner");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("owner", this.getOwner());
    }
    /**
     * Sets the owner property value. The owner property
     * @param value Value to set for the owner property.
     */
    public void setOwner(@jakarta.annotation.Nullable final AwsUser value) {
        this.BackingStore.set("owner", value);
    }
}
