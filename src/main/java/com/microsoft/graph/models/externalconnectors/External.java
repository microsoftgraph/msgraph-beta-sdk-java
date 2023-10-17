package com.microsoft.graph.models.externalconnectors;

import com.microsoft.graph.models.AuthorizationSystem;
import com.microsoft.graph.models.industrydata.IndustryDataRoot;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class External implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The authorizationSystems property
     */
    private java.util.List<AuthorizationSystem> authorizationSystems;
    /**
     * The connections property
     */
    private java.util.List<ExternalConnection> connections;
    /**
     * The industryData property
     */
    private IndustryDataRoot industryData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new External and sets the default values.
     */
    public External() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a External
     */
    @jakarta.annotation.Nonnull
    public static External createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new External();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the authorizationSystems property value. The authorizationSystems property
     * @return a java.util.List<AuthorizationSystem>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthorizationSystem> getAuthorizationSystems() {
        return this.authorizationSystems;
    }
    /**
     * Gets the connections property value. The connections property
     * @return a java.util.List<ExternalConnection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExternalConnection> getConnections() {
        return this.connections;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("authorizationSystems", (n) -> { this.setAuthorizationSystems(n.getCollectionOfObjectValues(AuthorizationSystem::createFromDiscriminatorValue)); });
        deserializerMap.put("connections", (n) -> { this.setConnections(n.getCollectionOfObjectValues(ExternalConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("industryData", (n) -> { this.setIndustryData(n.getObjectValue(IndustryDataRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the industryData property value. The industryData property
     * @return a IndustryDataRoot
     */
    @jakarta.annotation.Nullable
    public IndustryDataRoot getIndustryData() {
        return this.industryData;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
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
        writer.writeCollectionOfObjectValues("authorizationSystems", this.getAuthorizationSystems());
        writer.writeCollectionOfObjectValues("connections", this.getConnections());
        writer.writeObjectValue("industryData", this.getIndustryData());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the authorizationSystems property value. The authorizationSystems property
     * @param value Value to set for the authorizationSystems property.
     */
    public void setAuthorizationSystems(@jakarta.annotation.Nullable final java.util.List<AuthorizationSystem> value) {
        this.authorizationSystems = value;
    }
    /**
     * Sets the connections property value. The connections property
     * @param value Value to set for the connections property.
     */
    public void setConnections(@jakarta.annotation.Nullable final java.util.List<ExternalConnection> value) {
        this.connections = value;
    }
    /**
     * Sets the industryData property value. The industryData property
     * @param value Value to set for the industryData property.
     */
    public void setIndustryData(@jakarta.annotation.Nullable final IndustryDataRoot value) {
        this.industryData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
