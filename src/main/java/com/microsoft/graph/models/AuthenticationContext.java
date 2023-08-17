package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationContext implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Describes how the conditional access authentication context was triggered. A value of previouslySatisfied means the auth context was because the user already satisfied the requirements for that authentication context in some previous authentication event. A value of required means the user had to meet the authentication context requirement as part of the sign-in flow. The possible values are: required, previouslySatisfied, notApplicable, unknownFutureValue.
     */
    private AuthenticationContextDetail detail;
    /**
     * The identifier of a authentication context in your tenant.
     */
    private String id;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new authenticationContext and sets the default values.
     */
    public AuthenticationContext() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationContext
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationContext createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationContext();
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
     * Gets the detail property value. Describes how the conditional access authentication context was triggered. A value of previouslySatisfied means the auth context was because the user already satisfied the requirements for that authentication context in some previous authentication event. A value of required means the user had to meet the authentication context requirement as part of the sign-in flow. The possible values are: required, previouslySatisfied, notApplicable, unknownFutureValue.
     * @return a authenticationContextDetail
     */
    @jakarta.annotation.Nullable
    public AuthenticationContextDetail getDetail() {
        return this.detail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("detail", (n) -> { this.setDetail(n.getEnumValue(AuthenticationContextDetail.class)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The identifier of a authentication context in your tenant.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
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
        writer.writeEnumValue("detail", this.getDetail());
        writer.writeStringValue("id", this.getId());
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
     * Sets the detail property value. Describes how the conditional access authentication context was triggered. A value of previouslySatisfied means the auth context was because the user already satisfied the requirements for that authentication context in some previous authentication event. A value of required means the user had to meet the authentication context requirement as part of the sign-in flow. The possible values are: required, previouslySatisfied, notApplicable, unknownFutureValue.
     * @param value Value to set for the detail property.
     */
    public void setDetail(@jakarta.annotation.Nullable final AuthenticationContextDetail value) {
        this.detail = value;
    }
    /**
     * Sets the id property value. The identifier of a authentication context in your tenant.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
