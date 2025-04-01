package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CallSettings extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CallSettings} and sets the default values.
     */
    public CallSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CallSettings}
     */
    @jakarta.annotation.Nonnull
    public static CallSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallSettings();
    }
    /**
     * Gets the delegates property value. Represents the delegate settings.
     * @return a {@link java.util.List<DelegationSettings>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DelegationSettings> getDelegates() {
        return this.backingStore.get("delegates");
    }
    /**
     * Gets the delegators property value. Represents the delegator settings.
     * @return a {@link java.util.List<DelegationSettings>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DelegationSettings> getDelegators() {
        return this.backingStore.get("delegators");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("delegates", (n) -> { this.setDelegates(n.getCollectionOfObjectValues(DelegationSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("delegators", (n) -> { this.setDelegators(n.getCollectionOfObjectValues(DelegationSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("delegates", this.getDelegates());
        writer.writeCollectionOfObjectValues("delegators", this.getDelegators());
    }
    /**
     * Sets the delegates property value. Represents the delegate settings.
     * @param value Value to set for the delegates property.
     */
    public void setDelegates(@jakarta.annotation.Nullable final java.util.List<DelegationSettings> value) {
        this.backingStore.set("delegates", value);
    }
    /**
     * Sets the delegators property value. Represents the delegator settings.
     * @param value Value to set for the delegators property.
     */
    public void setDelegators(@jakarta.annotation.Nullable final java.util.List<DelegationSettings> value) {
        this.backingStore.set("delegators", value);
    }
}
