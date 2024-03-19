package com.example.loginv4.ui.drive

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.loginv4.databinding.FragmentDriveBinding

class DriveFragment : Fragment() {

private var _binding: FragmentDriveBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val driveViewModel =
            ViewModelProvider(this).get(DriveViewModel::class.java)

    _binding = FragmentDriveBinding.inflate(inflater, container, false)
    val root: View = binding.root

      val textView: TextView = binding.textDrive
      driveViewModel.text.observe(viewLifecycleOwner) {
          textView.text = it
      }
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}