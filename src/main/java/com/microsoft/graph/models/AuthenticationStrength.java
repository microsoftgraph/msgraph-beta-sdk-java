package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationStrength implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Identifier of the authentication strength.
     */
    private String authenticationStrengthId;
    /**
     * The result of the authentication strength. The possible values are: notSet, skippedForProofUp, satisfied, singleChallengeRequired, multipleChallengesRequired, singleRegistrationRequired, multipleRegistrationsRequired, cannotSatisfyDueToCombinationConfiguration, cannotSatisfy, unknownFutureValue.
     */
    private AuthenticationStrengthResult authenticationStrengthResult;
    /**
     * The name of the authentication strength.
     */
    private String displayName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new authenticationStrength and sets the default values.
     */
    public AuthenticationStrength() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationStrength
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationStrength createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationStrength();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the authenticationStrengthId property value. Identifier of the authentication strength.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAuthenticationStrengthId() {
        return this.authenticationStrengthId;
    }
    /**
     * Gets the authenticationStrengthResult property value. The result of the authentication strength. The possible values are: notSet, skippedForProofUp, satisfied, singleChallengeRequired, multipleChallengesRequired, singleRegistrationRequired, multipleRegistrationsRequired, cannotSatisfyDueToCombinationConfiguration, cannotSatisfy, unknownFutureValue.
     * @return a authenticationStrengthResult
     */
    @jakarta.annotation.Nullable
    public AuthenticationStrengthResult getAuthenticationStrengthResult() {
        return this.authenticationStrengthResult;
    }
    /**
     * Gets the displayName property value. The name of the authentication strength.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("authenticationStrengthId", (n) -> { this.setAuthenticationStrengthId(n.getStringValue()); });
        deserializerMap.put("authenticationStrengthResult", (n) -> { this.setAuthenticationStrengthResult(n.getEnumValue(AuthenticationStrengthResult.class)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("authenticationStrengthId", this.getAuthenticationStrengthId());
        writer.writeEnumValue("authenticationStrengthResult", this.getAuthenticationStrengthResult());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the authenticationStrengthId property value. Identifier of the authentication strength.
     * @param value Value to set for the authenticationStrengthId property.
     */
    public void setAuthenticationStrengthId(@jakarta.annotation.Nullable final String value) {
        this.authenticationStrengthId = value;
    }
    /**
     * Sets the authenticationStrengthResult property value. The result of the authentication strength. The possible values are: notSet, skippedForProofUp, satisfied, singleChallengeRequired, multipleChallengesRequired, singleRegistrationRequired, multipleRegistrationsRequired, cannotSatisfyDueToCombinationConfiguration, cannotSatisfy, unknownFutureValue.
     * @param value Value to set for the authenticationStrengthResult property.
     */
    public void setAuthenticationStrengthResult(@jakarta.annotation.Nullable final AuthenticationStrengthResult value) {
        this.authenticationStrengthResult = value;
    }
    /**
     * Sets the displayName property value. The name of the authentication strength.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
