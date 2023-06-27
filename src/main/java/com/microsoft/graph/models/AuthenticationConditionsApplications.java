package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationConditionsApplications implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Whether the custom authentication extension should trigger for all applications with appIds specified in the includeApplications relationship. This property must be set to false for listener of type onTokenIssuanceStartListener.
     */
    private Boolean includeAllApplications;
    /**
     * The includeApplications property
     */
    private java.util.List<AuthenticationConditionApplication> includeApplications;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new authenticationConditionsApplications and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationConditionsApplications() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationConditionsApplications
     */
    @javax.annotation.Nonnull
    public static AuthenticationConditionsApplications createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationConditionsApplications();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("includeAllApplications", (n) -> { this.setIncludeAllApplications(n.getBooleanValue()); });
        deserializerMap.put("includeApplications", (n) -> { this.setIncludeApplications(n.getCollectionOfObjectValues(AuthenticationConditionApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeAllApplications property value. Whether the custom authentication extension should trigger for all applications with appIds specified in the includeApplications relationship. This property must be set to false for listener of type onTokenIssuanceStartListener.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIncludeAllApplications() {
        return this.includeAllApplications;
    }
    /**
     * Gets the includeApplications property value. The includeApplications property
     * @return a AuthenticationConditionApplication
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationConditionApplication> getIncludeApplications() {
        return this.includeApplications;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("includeAllApplications", this.getIncludeAllApplications());
        writer.writeCollectionOfObjectValues("includeApplications", this.getIncludeApplications());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the includeAllApplications property value. Whether the custom authentication extension should trigger for all applications with appIds specified in the includeApplications relationship. This property must be set to false for listener of type onTokenIssuanceStartListener.
     * @param value Value to set for the includeAllApplications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeAllApplications(@javax.annotation.Nullable final Boolean value) {
        this.includeAllApplications = value;
    }
    /**
     * Sets the includeApplications property value. The includeApplications property
     * @param value Value to set for the includeApplications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeApplications(@javax.annotation.Nullable final java.util.List<AuthenticationConditionApplication> value) {
        this.includeApplications = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
