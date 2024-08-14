package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TemporaryAccessPassAuthenticationMethod extends AuthenticationMethod implements Parsable {
    /**
     * Instantiates a new {@link TemporaryAccessPassAuthenticationMethod} and sets the default values.
     */
    public TemporaryAccessPassAuthenticationMethod() {
        super();
        this.setOdataType("#microsoft.graph.temporaryAccessPassAuthenticationMethod");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TemporaryAccessPassAuthenticationMethod}
     */
    @jakarta.annotation.Nonnull
    public static TemporaryAccessPassAuthenticationMethod createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TemporaryAccessPassAuthenticationMethod();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isUsableOnce", (n) -> { this.setIsUsableOnce(n.getBooleanValue()); });
        deserializerMap.put("lifetimeInMinutes", (n) -> { this.setLifetimeInMinutes(n.getIntegerValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("temporaryAccessPass", (n) -> { this.setTemporaryAccessPass(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isUsableOnce property value. Determines whether the pass is limited to a one-time use. If true, the pass can be used once; if false, the pass can be used multiple times within the Temporary Access Pass lifetime.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsUsableOnce() {
        return this.backingStore.get("isUsableOnce");
    }
    /**
     * Gets the lifetimeInMinutes property value. The lifetime of the Temporary Access Pass in minutes starting at startDateTime. Must be between 10 and 43200 inclusive (equivalent to 30 days).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLifetimeInMinutes() {
        return this.backingStore.get("lifetimeInMinutes");
    }
    /**
     * Gets the startDateTime property value. The date and time when the Temporary Access Pass becomes available to use and when isUsable is true is enforced.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Gets the temporaryAccessPass property value. The Temporary Access Pass used to authenticate. Returned only on creation of a new temporaryAccessPassAuthenticationMethod object; Hidden in subsequent read operations and returned as null with GET.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTemporaryAccessPass() {
        return this.backingStore.get("temporaryAccessPass");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isUsableOnce", this.getIsUsableOnce());
        writer.writeIntegerValue("lifetimeInMinutes", this.getLifetimeInMinutes());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("temporaryAccessPass", this.getTemporaryAccessPass());
    }
    /**
     * Sets the isUsableOnce property value. Determines whether the pass is limited to a one-time use. If true, the pass can be used once; if false, the pass can be used multiple times within the Temporary Access Pass lifetime.
     * @param value Value to set for the isUsableOnce property.
     */
    public void setIsUsableOnce(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isUsableOnce", value);
    }
    /**
     * Sets the lifetimeInMinutes property value. The lifetime of the Temporary Access Pass in minutes starting at startDateTime. Must be between 10 and 43200 inclusive (equivalent to 30 days).
     * @param value Value to set for the lifetimeInMinutes property.
     */
    public void setLifetimeInMinutes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("lifetimeInMinutes", value);
    }
    /**
     * Sets the startDateTime property value. The date and time when the Temporary Access Pass becomes available to use and when isUsable is true is enforced.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
    /**
     * Sets the temporaryAccessPass property value. The Temporary Access Pass used to authenticate. Returned only on creation of a new temporaryAccessPassAuthenticationMethod object; Hidden in subsequent read operations and returned as null with GET.
     * @param value Value to set for the temporaryAccessPass property.
     */
    public void setTemporaryAccessPass(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("temporaryAccessPass", value);
    }
}
