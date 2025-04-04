package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenantStatus extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TenantStatus} and sets the default values.
     */
    public TenantStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TenantStatus}
     */
    @jakarta.annotation.Nonnull
    public static TenantStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantStatus();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("onboardingErrorMessage", (n) -> { this.setOnboardingErrorMessage(n.getStringValue()); });
        deserializerMap.put("onboardingStatus", (n) -> { this.setOnboardingStatus(n.getEnumValue(OnboardingStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the onboardingErrorMessage property value. Reflects a message to the user if there&apos;s an error.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOnboardingErrorMessage() {
        return this.backingStore.get("onboardingErrorMessage");
    }
    /**
     * Gets the onboardingStatus property value. The onboardingStatus property
     * @return a {@link OnboardingStatus}
     */
    @jakarta.annotation.Nullable
    public OnboardingStatus getOnboardingStatus() {
        return this.backingStore.get("onboardingStatus");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("onboardingErrorMessage", this.getOnboardingErrorMessage());
        writer.writeEnumValue("onboardingStatus", this.getOnboardingStatus());
    }
    /**
     * Sets the onboardingErrorMessage property value. Reflects a message to the user if there&apos;s an error.
     * @param value Value to set for the onboardingErrorMessage property.
     */
    public void setOnboardingErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("onboardingErrorMessage", value);
    }
    /**
     * Sets the onboardingStatus property value. The onboardingStatus property
     * @param value Value to set for the onboardingStatus property.
     */
    public void setOnboardingStatus(@jakarta.annotation.Nullable final OnboardingStatus value) {
        this.backingStore.set("onboardingStatus", value);
    }
}
