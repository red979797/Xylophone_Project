class MainActivity : AppCompatActivity() {
    private val binding by lazy { 
        ActivityMainBinding.inflate(layoutInflater)
    }
    
     override fun onCreate(savedInstanceState: Bundle?) {

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
  
    }
}
