package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NetworkLocationDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Provides the name of the network used when signing in. */
    private java.util.List<String> _networkNames;
    /** Provides the type of network used when signing in. Possible values are: intranet, extranet, namedNetwork, trusted, unknownFutureValue. */
    private NetworkType _networkType;
    /**
     * Instantiates a new networkLocationDetail and sets the default values.
     * @return a void
     */
    public NetworkLocationDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a networkLocationDetail
     */
    @javax.annotation.Nonnull
    public static NetworkLocationDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkLocationDetail();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final NetworkLocationDetail currentObject = this;
        return new HashMap<>(2) {{
            this.put("networkNames", (n) -> { currentObject.setNetworkNames(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("networkType", (n) -> { currentObject.setNetworkType(n.getEnumValue(NetworkType.class)); });
        }};
    }
    /**
     * Gets the networkNames property value. Provides the name of the network used when signing in.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNetworkNames() {
        return this._networkNames;
    }
    /**
     * Gets the networkType property value. Provides the type of network used when signing in. Possible values are: intranet, extranet, namedNetwork, trusted, unknownFutureValue.
     * @return a networkType
     */
    @javax.annotation.Nullable
    public NetworkType getNetworkType() {
        return this._networkType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("networkNames", this.getNetworkNames());
        writer.writeEnumValue("networkType", this.getNetworkType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the networkNames property value. Provides the name of the network used when signing in.
     * @param value Value to set for the networkNames property.
     * @return a void
     */
    public void setNetworkNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._networkNames = value;
    }
    /**
     * Sets the networkType property value. Provides the type of network used when signing in. Possible values are: intranet, extranet, namedNetwork, trusted, unknownFutureValue.
     * @param value Value to set for the networkType property.
     * @return a void
     */
    public void setNetworkType(@javax.annotation.Nullable final NetworkType value) {
        this._networkType = value;
    }
}
