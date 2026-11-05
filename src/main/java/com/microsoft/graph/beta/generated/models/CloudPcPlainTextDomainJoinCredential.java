package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcPlainTextDomainJoinCredential extends CloudPcDomainJoinCredential implements Parsable {
    /**
     * Instantiates a new {@link CloudPcPlainTextDomainJoinCredential} and sets the default values.
     */
    public CloudPcPlainTextDomainJoinCredential() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcPlainTextDomainJoinCredential");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcPlainTextDomainJoinCredential}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcPlainTextDomainJoinCredential createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcPlainTextDomainJoinCredential();
    }
    /**
     * Gets the domainPassword property value. The password associated with the domainUserPrincipalName. Required in requests. Not returned in responses.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomainPassword() {
        return this.backingStore.get("domainPassword");
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
        deserializerMap.put("domainPassword", (n) -> { this.setDomainPassword(n.getStringValue()); });
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
        writer.writeStringValue("domainPassword", this.getDomainPassword());
        writer.writeStringValue("domainUserPrincipalName", this.getDomainUserPrincipalName());
    }
    /**
     * Sets the domainPassword property value. The password associated with the domainUserPrincipalName. Required in requests. Not returned in responses.
     * @param value Value to set for the domainPassword property.
     */
    public void setDomainPassword(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("domainPassword", value);
    }
    /**
     * Sets the domainUserPrincipalName property value. The user principal name of an Active Directory account that has sufficient permissions to join devices to the domain. The value must be in UPN format, for example, domainjoin@ad.contoso.com. Required.
     * @param value Value to set for the domainUserPrincipalName property.
     */
    public void setDomainUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("domainUserPrincipalName", value);
    }
}
