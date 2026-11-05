package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcDomainJoinPlainTextUserIdentity extends CloudPcDomainJoinUserIdentity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcDomainJoinPlainTextUserIdentity} and sets the default values.
     */
    public CloudPcDomainJoinPlainTextUserIdentity() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcDomainJoinPlainTextUserIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcDomainJoinPlainTextUserIdentity}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcDomainJoinPlainTextUserIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcDomainJoinPlainTextUserIdentity();
    }
    /**
     * Gets the domainUserPrincipalName property value. The user principal name of an Active Directory account that has sufficient permissions to join devices to the domain. The value must be in UPN format, for example, domainjoin@ad.contoso.com. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomainUserPrincipalName() {
        return this.backingStore.get("domainUserPrincipalName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("domainUserPrincipalName", (n) -> { this.setDomainUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("domainUserPrincipalName", this.getDomainUserPrincipalName());
    }
    /**
     * Sets the domainUserPrincipalName property value. The user principal name of an Active Directory account that has sufficient permissions to join devices to the domain. The value must be in UPN format, for example, domainjoin@ad.contoso.com. Required.
     * @param value Value to set for the domainUserPrincipalName property.
     */
    public void setDomainUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("domainUserPrincipalName", value);
    }
}
