package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TenantStatus extends Entity implements Parsable {
    /**
     * Reflects a message to the user in case of an error.
     */
    private String onboardingErrorMessage;
    /**
     * The onboardingStatus property
     */
    private OnboardingStatus onboardingStatus;
    /**
     * Instantiates a new tenantStatus and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public TenantStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantStatus
     */
    @jakarta.annotation.Nonnull
    public static TenantStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenantStatus();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("onboardingErrorMessage", (n) -> { this.setOnboardingErrorMessage(n.getStringValue()); });
        deserializerMap.put("onboardingStatus", (n) -> { this.setOnboardingStatus(n.getEnumValue(OnboardingStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the onboardingErrorMessage property value. Reflects a message to the user in case of an error.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOnboardingErrorMessage() {
        return this.onboardingErrorMessage;
    }
    /**
     * Gets the onboardingStatus property value. The onboardingStatus property
     * @return a onboardingStatus
     */
    @jakarta.annotation.Nullable
    public OnboardingStatus getOnboardingStatus() {
        return this.onboardingStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("onboardingErrorMessage", this.getOnboardingErrorMessage());
        writer.writeEnumValue("onboardingStatus", this.getOnboardingStatus());
    }
    /**
     * Sets the onboardingErrorMessage property value. Reflects a message to the user in case of an error.
     * @param value Value to set for the onboardingErrorMessage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOnboardingErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.onboardingErrorMessage = value;
    }
    /**
     * Sets the onboardingStatus property value. The onboardingStatus property
     * @param value Value to set for the onboardingStatus property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOnboardingStatus(@jakarta.annotation.Nullable final OnboardingStatus value) {
        this.onboardingStatus = value;
    }
}
