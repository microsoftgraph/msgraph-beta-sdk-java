package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FederatedIdentityCredential extends Entity implements Parsable {
    /**
     * Instantiates a new {@link FederatedIdentityCredential} and sets the default values.
     */
    public FederatedIdentityCredential() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FederatedIdentityCredential}
     */
    @jakarta.annotation.Nonnull
    public static FederatedIdentityCredential createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FederatedIdentityCredential();
    }
    /**
     * Gets the audiences property value. The audience that can appear in the external token. This field is mandatory and should be set to api://AzureADTokenExchange for Microsoft Entra ID. It says what Microsoft identity platform should accept in the aud claim in the incoming token. This value represents Microsoft Entra ID in your external identity provider and has no fixed value across identity providers - you may need to create a new application registration in your identity provider to serve as the audience of this token. This field can only accept a single value and has a limit of 600 characters. Required.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAudiences() {
        return this.backingStore.get("audiences");
    }
    /**
     * Gets the claimsMatchingExpression property value. Nullable.  Defaults to null if not set. Enables the use of claims matching expressions against specified claims. If claimsMatchingExpression is defined, subject must be null. For the list of supported expression syntax and claims, visit the Flexible FIC reference.
     * @return a {@link FederatedIdentityExpression}
     */
    @jakarta.annotation.Nullable
    public FederatedIdentityExpression getClaimsMatchingExpression() {
        return this.backingStore.get("claimsMatchingExpression");
    }
    /**
     * Gets the description property value. The un-validated, user-provided description of the federated identity credential. It has a limit of 600 characters. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("audiences", (n) -> { this.setAudiences(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("claimsMatchingExpression", (n) -> { this.setClaimsMatchingExpression(n.getObjectValue(FederatedIdentityExpression::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("issuer", (n) -> { this.setIssuer(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issuer property value. The URL of the external identity provider and must match the issuer claim of the external token being exchanged. The combination of the values of issuer and subject must be unique on the app. It has a limit of 600 characters. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssuer() {
        return this.backingStore.get("issuer");
    }
    /**
     * Gets the name property value. The unique identifier for the federated identity credential, which has a limit of 120 characters and must be URL friendly. It is immutable once created. Alternate key. Required. Not nullable. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the subject property value. Nullable.  Defaults to null if not set. The identifier of the external software workload within the external identity provider. Like the audience value, it has no fixed format, as each identity provider uses their own - sometimes a GUID, sometimes a colon delimited identifier, sometimes arbitrary strings. The value here must match the sub claim within the token presented to Microsoft Entra ID. The combination of issuer and subject must be unique on the app. It has a limit of 600 characters. If subject is defined, claimsMatchingExpression must be null. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.backingStore.get("subject");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("audiences", this.getAudiences());
        writer.writeObjectValue("claimsMatchingExpression", this.getClaimsMatchingExpression());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("issuer", this.getIssuer());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("subject", this.getSubject());
    }
    /**
     * Sets the audiences property value. The audience that can appear in the external token. This field is mandatory and should be set to api://AzureADTokenExchange for Microsoft Entra ID. It says what Microsoft identity platform should accept in the aud claim in the incoming token. This value represents Microsoft Entra ID in your external identity provider and has no fixed value across identity providers - you may need to create a new application registration in your identity provider to serve as the audience of this token. This field can only accept a single value and has a limit of 600 characters. Required.
     * @param value Value to set for the audiences property.
     */
    public void setAudiences(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("audiences", value);
    }
    /**
     * Sets the claimsMatchingExpression property value. Nullable.  Defaults to null if not set. Enables the use of claims matching expressions against specified claims. If claimsMatchingExpression is defined, subject must be null. For the list of supported expression syntax and claims, visit the Flexible FIC reference.
     * @param value Value to set for the claimsMatchingExpression property.
     */
    public void setClaimsMatchingExpression(@jakarta.annotation.Nullable final FederatedIdentityExpression value) {
        this.backingStore.set("claimsMatchingExpression", value);
    }
    /**
     * Sets the description property value. The un-validated, user-provided description of the federated identity credential. It has a limit of 600 characters. Optional.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the issuer property value. The URL of the external identity provider and must match the issuer claim of the external token being exchanged. The combination of the values of issuer and subject must be unique on the app. It has a limit of 600 characters. Required.
     * @param value Value to set for the issuer property.
     */
    public void setIssuer(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("issuer", value);
    }
    /**
     * Sets the name property value. The unique identifier for the federated identity credential, which has a limit of 120 characters and must be URL friendly. It is immutable once created. Alternate key. Required. Not nullable. Supports $filter (eq).
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the subject property value. Nullable.  Defaults to null if not set. The identifier of the external software workload within the external identity provider. Like the audience value, it has no fixed format, as each identity provider uses their own - sometimes a GUID, sometimes a colon delimited identifier, sometimes arbitrary strings. The value here must match the sub claim within the token presented to Microsoft Entra ID. The combination of issuer and subject must be unique on the app. It has a limit of 600 characters. If subject is defined, claimsMatchingExpression must be null. Supports $filter (eq).
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subject", value);
    }
}
