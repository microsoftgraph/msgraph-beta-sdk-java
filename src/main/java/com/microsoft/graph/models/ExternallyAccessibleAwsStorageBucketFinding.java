package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternallyAccessibleAwsStorageBucketFinding extends Finding implements Parsable {
    /**
     * Instantiates a new ExternallyAccessibleAwsStorageBucketFinding and sets the default values.
     */
    public ExternallyAccessibleAwsStorageBucketFinding() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExternallyAccessibleAwsStorageBucketFinding
     */
    @jakarta.annotation.Nonnull
    public static ExternallyAccessibleAwsStorageBucketFinding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternallyAccessibleAwsStorageBucketFinding();
    }
    /**
     * Gets the accessibility property value. The accessibility property
     * @return a AwsAccessType
     */
    @jakarta.annotation.Nullable
    public AwsAccessType getAccessibility() {
        return this.backingStore.get("accessibility");
    }
    /**
     * Gets the accountsWithAccess property value. The accountsWithAccess property
     * @return a AccountsWithAccess
     */
    @jakarta.annotation.Nullable
    public AccountsWithAccess getAccountsWithAccess() {
        return this.backingStore.get("accountsWithAccess");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessibility", (n) -> { this.setAccessibility(n.getEnumValue(AwsAccessType.class)); });
        deserializerMap.put("accountsWithAccess", (n) -> { this.setAccountsWithAccess(n.getObjectValue(AccountsWithAccess::createFromDiscriminatorValue)); });
        deserializerMap.put("storageBucket", (n) -> { this.setStorageBucket(n.getObjectValue(AuthorizationSystemResource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the storageBucket property value. The storageBucket property
     * @return a AuthorizationSystemResource
     */
    @jakarta.annotation.Nullable
    public AuthorizationSystemResource getStorageBucket() {
        return this.backingStore.get("storageBucket");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("accessibility", this.getAccessibility());
        writer.writeObjectValue("accountsWithAccess", this.getAccountsWithAccess());
        writer.writeObjectValue("storageBucket", this.getStorageBucket());
    }
    /**
     * Sets the accessibility property value. The accessibility property
     * @param value Value to set for the accessibility property.
     */
    public void setAccessibility(@jakarta.annotation.Nullable final AwsAccessType value) {
        this.backingStore.set("accessibility", value);
    }
    /**
     * Sets the accountsWithAccess property value. The accountsWithAccess property
     * @param value Value to set for the accountsWithAccess property.
     */
    public void setAccountsWithAccess(@jakarta.annotation.Nullable final AccountsWithAccess value) {
        this.backingStore.set("accountsWithAccess", value);
    }
    /**
     * Sets the storageBucket property value. The storageBucket property
     * @param value Value to set for the storageBucket property.
     */
    public void setStorageBucket(@jakarta.annotation.Nullable final AuthorizationSystemResource value) {
        this.backingStore.set("storageBucket", value);
    }
}
