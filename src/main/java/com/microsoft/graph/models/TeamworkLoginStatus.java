package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkLoginStatus implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Information about the Exchange connection. */
    private TeamworkConnection _exchangeConnection;
    /** The OdataType property */
    private String _odataType;
    /** Information about the Skype for Business connection. */
    private TeamworkConnection _skypeConnection;
    /** Information about the Teams connection. */
    private TeamworkConnection _teamsConnection;
    /**
     * Instantiates a new teamworkLoginStatus and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkLoginStatus() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teamworkLoginStatus");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkLoginStatus
     */
    @javax.annotation.Nonnull
    public static TeamworkLoginStatus createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkLoginStatus();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the exchangeConnection property value. Information about the Exchange connection.
     * @return a teamworkConnection
     */
    @javax.annotation.Nullable
    public TeamworkConnection getExchangeConnection() {
        return this._exchangeConnection;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkLoginStatus currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(4);
        deserializerMap.put("exchangeConnection", (n) -> { currentObject.setExchangeConnection(n.getObjectValue(TeamworkConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("skypeConnection", (n) -> { currentObject.setSkypeConnection(n.getObjectValue(TeamworkConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("teamsConnection", (n) -> { currentObject.setTeamsConnection(n.getObjectValue(TeamworkConnection::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the skypeConnection property value. Information about the Skype for Business connection.
     * @return a teamworkConnection
     */
    @javax.annotation.Nullable
    public TeamworkConnection getSkypeConnection() {
        return this._skypeConnection;
    }
    /**
     * Gets the teamsConnection property value. Information about the Teams connection.
     * @return a teamworkConnection
     */
    @javax.annotation.Nullable
    public TeamworkConnection getTeamsConnection() {
        return this._teamsConnection;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("exchangeConnection", this.getExchangeConnection());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("skypeConnection", this.getSkypeConnection());
        writer.writeObjectValue("teamsConnection", this.getTeamsConnection());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the exchangeConnection property value. Information about the Exchange connection.
     * @param value Value to set for the exchangeConnection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExchangeConnection(@javax.annotation.Nullable final TeamworkConnection value) {
        this._exchangeConnection = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the skypeConnection property value. Information about the Skype for Business connection.
     * @param value Value to set for the skypeConnection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkypeConnection(@javax.annotation.Nullable final TeamworkConnection value) {
        this._skypeConnection = value;
    }
    /**
     * Sets the teamsConnection property value. Information about the Teams connection.
     * @param value Value to set for the teamsConnection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTeamsConnection(@javax.annotation.Nullable final TeamworkConnection value) {
        this._teamsConnection = value;
    }
}
