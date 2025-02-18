package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnPhoneMethodLoadStartExternalUsersAuthHandler extends OnPhoneMethodLoadStartHandler implements Parsable {
    /**
     * Instantiates a new {@link OnPhoneMethodLoadStartExternalUsersAuthHandler} and sets the default values.
     */
    public OnPhoneMethodLoadStartExternalUsersAuthHandler() {
        super();
        this.setOdataType("#microsoft.graph.onPhoneMethodLoadStartExternalUsersAuthHandler");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnPhoneMethodLoadStartExternalUsersAuthHandler}
     */
    @jakarta.annotation.Nonnull
    public static OnPhoneMethodLoadStartExternalUsersAuthHandler createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPhoneMethodLoadStartExternalUsersAuthHandler();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("smsOptions", (n) -> { this.setSmsOptions(n.getObjectValue(PhoneOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("voiceOptions", (n) -> { this.setVoiceOptions(n.getObjectValue(PhoneOptions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the smsOptions property value. The smsOptions property
     * @return a {@link PhoneOptions}
     */
    @jakarta.annotation.Nullable
    public PhoneOptions getSmsOptions() {
        return this.backingStore.get("smsOptions");
    }
    /**
     * Gets the voiceOptions property value. The voiceOptions property
     * @return a {@link PhoneOptions}
     */
    @jakarta.annotation.Nullable
    public PhoneOptions getVoiceOptions() {
        return this.backingStore.get("voiceOptions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("smsOptions", this.getSmsOptions());
        writer.writeObjectValue("voiceOptions", this.getVoiceOptions());
    }
    /**
     * Sets the smsOptions property value. The smsOptions property
     * @param value Value to set for the smsOptions property.
     */
    public void setSmsOptions(@jakarta.annotation.Nullable final PhoneOptions value) {
        this.backingStore.set("smsOptions", value);
    }
    /**
     * Sets the voiceOptions property value. The voiceOptions property
     * @param value Value to set for the voiceOptions property.
     */
    public void setVoiceOptions(@jakarta.annotation.Nullable final PhoneOptions value) {
        this.backingStore.set("voiceOptions", value);
    }
}
