package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkLoginStatus implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Information about the Exchange connection.
     */
    private TeamworkConnection exchangeConnection;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Information about the Skype for Business connection.
     */
    private TeamworkConnection skypeConnection;
    /**
     * Information about the Teams connection.
     */
    private TeamworkConnection teamsConnection;
    /**
     * Instantiates a new TeamworkLoginStatus and sets the default values.
     */
    public TeamworkLoginStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkLoginStatus
     */
    @jakarta.annotation.Nonnull
    public static TeamworkLoginStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkLoginStatus();
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
     * Gets the exchangeConnection property value. Information about the Exchange connection.
     * @return a TeamworkConnection
     */
    @jakarta.annotation.Nullable
    public TeamworkConnection getExchangeConnection() {
        return this.exchangeConnection;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("exchangeConnection", (n) -> { this.setExchangeConnection(n.getObjectValue(TeamworkConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("skypeConnection", (n) -> { this.setSkypeConnection(n.getObjectValue(TeamworkConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("teamsConnection", (n) -> { this.setTeamsConnection(n.getObjectValue(TeamworkConnection::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the skypeConnection property value. Information about the Skype for Business connection.
     * @return a TeamworkConnection
     */
    @jakarta.annotation.Nullable
    public TeamworkConnection getSkypeConnection() {
        return this.skypeConnection;
    }
    /**
     * Gets the teamsConnection property value. Information about the Teams connection.
     * @return a TeamworkConnection
     */
    @jakarta.annotation.Nullable
    public TeamworkConnection getTeamsConnection() {
        return this.teamsConnection;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("exchangeConnection", this.getExchangeConnection());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("skypeConnection", this.getSkypeConnection());
        writer.writeObjectValue("teamsConnection", this.getTeamsConnection());
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
     * Sets the exchangeConnection property value. Information about the Exchange connection.
     * @param value Value to set for the exchangeConnection property.
     */
    public void setExchangeConnection(@jakarta.annotation.Nullable final TeamworkConnection value) {
        this.exchangeConnection = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the skypeConnection property value. Information about the Skype for Business connection.
     * @param value Value to set for the skypeConnection property.
     */
    public void setSkypeConnection(@jakarta.annotation.Nullable final TeamworkConnection value) {
        this.skypeConnection = value;
    }
    /**
     * Sets the teamsConnection property value. Information about the Teams connection.
     * @param value Value to set for the teamsConnection property.
     */
    public void setTeamsConnection(@jakarta.annotation.Nullable final TeamworkConnection value) {
        this.teamsConnection = value;
    }
}
