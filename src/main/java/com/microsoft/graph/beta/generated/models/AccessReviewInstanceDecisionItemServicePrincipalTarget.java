package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AccessReviewInstanceDecisionItemServicePrincipalTarget extends AccessReviewInstanceDecisionItemTarget implements Parsable {
    /**
     * Instantiates a new {@link AccessReviewInstanceDecisionItemServicePrincipalTarget} and sets the default values.
     */
    public AccessReviewInstanceDecisionItemServicePrincipalTarget() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewInstanceDecisionItemServicePrincipalTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AccessReviewInstanceDecisionItemServicePrincipalTarget}
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewInstanceDecisionItemServicePrincipalTarget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInstanceDecisionItemServicePrincipalTarget();
    }
    /**
     * Gets the appId property value. The appId for the service principal entity being reviewed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("servicePrincipalDisplayName", (n) -> { this.setServicePrincipalDisplayName(n.getStringValue()); });
        deserializerMap.put("servicePrincipalId", (n) -> { this.setServicePrincipalId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the servicePrincipalDisplayName property value. The display name of the service principal whose access is being reviewed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalDisplayName() {
        return this.backingStore.get("servicePrincipalDisplayName");
    }
    /**
     * Gets the servicePrincipalId property value. The servicePrincipalId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServicePrincipalId() {
        return this.backingStore.get("servicePrincipalId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("servicePrincipalDisplayName", this.getServicePrincipalDisplayName());
        writer.writeStringValue("servicePrincipalId", this.getServicePrincipalId());
    }
    /**
     * Sets the appId property value. The appId for the service principal entity being reviewed.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the servicePrincipalDisplayName property value. The display name of the service principal whose access is being reviewed.
     * @param value Value to set for the servicePrincipalDisplayName property.
     */
    public void setServicePrincipalDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePrincipalDisplayName", value);
    }
    /**
     * Sets the servicePrincipalId property value. The servicePrincipalId property
     * @param value Value to set for the servicePrincipalId property.
     */
    public void setServicePrincipalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePrincipalId", value);
    }
}
